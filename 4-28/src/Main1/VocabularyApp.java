
import java.io.IOException;
import java.util.Scanner;

public class VocabularyApp {
    
    private WordManager wordManager;
    private Quiz quiz;
    private FileHandler fileHandler;
    private Scanner scanner;

    public VocabularyApp() {
        wordManager = new WordManager();
        quiz = new Quiz(wordManager);
        fileHandler = new FileHandler();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean start = true;
        while (start) {   
            System.out.println("=== 英単語暗記アプリ ===\n1: 単語を登録する\n2: クイズを受ける\n3: CSVファイルから単語をインポート\n4: CSVファイルに単語をエクスポート\n5: 終了する" );
            String choise = scanner.nextLine();
            switch (choise) {
                case "1" : registerWord();
                break;  

                case "2" : startQuiz();
                break;

                case "3" : importWords();
                break;

                case "4" : exportWords();
                break;
                    
                case "5" : start = false; 
                break;               
                
                default : System.out.println("不正な文字です。半角数字の1から5を入力してください");
            }
        }
    }

        public void registerWord() {
            System.out.println("英単語を入力してください：");
            String english = scanner.nextLine();
            System.out.println("日本語訳を入力してください：");
            String japanese = scanner.nextLine();
            if(english.isEmpty()||japanese.isEmpty()) {
                System.out.println("空欄の箇所があります。文字を入力してください"); 
                return;
            }

            boolean exists = false;
            for(Word w : wordManager.getWords()){
                if(w.getEnglish().equals(english)) {
                    exists = true;
                    break;
                }
            } 

            if(exists) {
                System.out.println("すでに登録されています");
            } else if(wordManager.getWordCount() >= 1000){
                System.out.println("これ以上単語の登録はできません");
                return;
            }else{ 
                Word word = new Word(english, japanese);
                //long start = System.currentTimeMillis();
                wordManager.addWord(word);
                //long end = System.currentTimeMillis();
                //double score = (end - start)/1000.0;
                //System.out.println("登録時間: " + score + "秒");
                System.out.println("単語を登録しました\n");
            }
        }

        public void startQuiz() {
            System.out.println("=== クイズを開始します ===");
            int count = wordManager.getWordCount();
            //ArrayList<Word> quizWords = new ArrayList<>(wordManager.getWords());
            if (count == 0) {
                System.out.println("登録された単語がありません。\n");
            } else {
                quiz.copyWord();
                while(quiz.getQuizWordcount() > 0) {
                     Word randomWord = quiz.getRandomWord();
                    //long start = System.currentTimeMillis();
                    //long end = System.currentTimeMillis();
                    //double seconds = (end - start) / 1000.0;
                    //System.out.println("クイズ出題の応答時間" + seconds + "秒");
                    System.out.println(randomWord.getEnglish().toString() + "の意味は？");
                    String answer = scanner.nextLine();
                    String result = quiz.checkAnswer(randomWord,answer);
                    quiz.removeWord(randomWord);
                    System.out.println(result);
                }
                    System.out.println("クイズ終了!\n" +quiz.getTotalQuestions() +"問中" + quiz.getScore() + "問正解でした!\n");
                    quiz.resetQuizResult();
            }
        }
        
        public void importWords() {
            System.out.println("CSVファイル名を入力してください：");
            try {
                String filename = scanner.nextLine();

                //long start = System.currentTimeMillis();
                fileHandler.importFromCSV(filename, wordManager);
                if(wordManager.getWordCount() >= 1000) {
                    System.out.println("これ以上単語を登録できません");
                    return;
                } else {
                    //long end = System.currentTimeMillis();
                    //double scores = (end-start) /1000.0;
                    //System.out.println("CSVインポートの応答時間" + scores + "秒");
                    System.out.println(wordManager.getWordCount() + "個の単語を読み込みました。");
                }
            } catch (IOException e) {
                // TODO: handle exception
                System.out.println("ファイルの読み込みに失敗しました");
            }
        }

        public void exportWords() {
            System.out.println("CSVファイル名を入力してください：");
            try {
                String filename = scanner.nextLine();
                fileHandler.exportToCSV(wordManager.getWords(), filename);
                System.out.println(wordManager.getWordCount() + "個の単語を保存しました。");
            } catch (IOException e) {
                // TODO: handle exception
                System.out.println("ファイルの保存に失敗しました");
            }
            
        }
    public static void main(String[] args) {

        VocabularyApp vocabularyApp = new VocabularyApp();
        vocabularyApp.start();
    }
}
