import java.util.Scanner;
import java.io.IOException;
import java.util.List;

public class VocabularyApp {
    WordManager wordManager;
    Quiz quiz;
    FileHandler fileHandler;
    Scanner scanner =  new Scanner(System.in);
    DBManager dbManager;

    public VocabularyApp() {
        this.dbManager = new DBManager();
        this.wordManager = new WordManager(dbManager);
        this.fileHandler = new FileHandler();
        this.quiz = new Quiz(wordManager);
    }

    public void start() {
        boolean start = true;
        while (start) {
            System.out.println("=== 英単語暗記アプリ ===");
            System.out.println("1: 単語を登録する\n" + //
                            "2: クイズを受ける\n" + //
                            "3: CSVファイルから単語をインポート\n" + //
                            "4: CSVファイルに単語をエクスポート\n" + //
                            "5: 単語を削除する\n" + //
                            "6: 単語を更新する\n" + //
                            "7: 終了する\n");

            String choice = scanner.nextLine();
                switch (choice){
                    case "1" : registerWord(); 
                    break;

                    case "2" : startQuiz();
                    break;

                    case "3" : importWords();
                    break;

                    case "4" : exportWords();
                    break;

                    case "5" : deleteWord();
                    break;
            
                    case "6" : updateWord();
                    break;

                    case "7" : start = false;
                    break;

                    default : System.out.println("不正な文字です。半角数字の1から7を入力してください");
            }
        }      
    }

    public void registerWord() {
        if (wordManager.getWordCount() >= 1000) {
            System.out.println("これ以上単語の登録はできません。");
        }
        else {
            System.out.println("登録したい英単語を入力してください");
            String english = scanner.nextLine();
            System.out.println("登録したい日本語を入力してください");
            String japanese  = scanner.nextLine();
            if (english.isEmpty() || japanese.isEmpty()) {
                System.out.println("文字を入力してください");
            } else {
                Word word = new Word(english, japanese);
                wordManager.addWord(word);
                System.out.println("単語を登録しました");
            }
        }
    }

    public void startQuiz() {
        System.out.println("クイズを開始します");
        if (wordManager.getWordCount() <= 0) {
            System.out.println("登録された単語がありません");
            return;
        } else {
            List<Word> getWord = wordManager.getWords();
            while (!getWord.isEmpty()) {
                Word randomWord = quiz.getRandomWord(getWord);
                String englishWord = randomWord.getEnglish();
                System.out.println(englishWord + "の意味は？");
                String result = scanner.nextLine();
                quiz.checkAnswer(randomWord, result);
                getWord.remove(randomWord);
            }
            System.out.println("クイズ終了!");
            System.out.println(quiz.getTotalQuestions() + "問中" + quiz.getScore() + "問正解でした！\n");
            quiz.totalQuestionsScoreReset();
        }
    }

    public void importWords() {
        try {
            if (wordManager.getWordCount() >= 1000) {
                System.out.println("これ以上単語の登録はできません。");
            } else {
                System.out.println("CSVファイル名を入力してください:");
                String importName = scanner.nextLine();
                fileHandler.importFromCSV(importName, wordManager);
                int wordCount = fileHandler.getCount();
                System.out.println(wordCount + "個の単語を読み込みました");
            } 
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("正しいファイル名を入力してください");
        } catch (IllegalArgumentException e){
            System.out.println("不正な形式のCSVファイルです");
        }
    }

    public void exportWords() {
        System.out.println("CSVファイル名を入力してください:");
        String exportName = scanner.nextLine();
        List <Word> words = wordManager.getWords();
        fileHandler.exportTOSCV(words, exportName);
        System.out.println(wordManager.getWordCount() + "個の単語を保存しました");
    }

    public void deleteWord() {
        System.out.println("削除する英単語を入力してください：");
        String delete = scanner.nextLine();
        wordManager.deleteWord(delete);
    }

    public void updateWord() {
        //try {
            System.out.println("更新する英単語を入力してください：");
            String english = scanner.nextLine();
            System.out.println("新しい日本語訳を入力してください：");
            String japanese = scanner.nextLine();
            wordManager.updateWord(english, japanese);
    }

    public void cleanup() {
        dbManager.close();
    } 
    public static void main(String[] args) {
        VocabularyApp vocabularyApp = new VocabularyApp();
        vocabularyApp.start();
    }
}