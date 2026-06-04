package Main3;

public class Main3 {

 public static boolean validateUsername(String username) {
        // ここにコードを書いてください
        if (username.matches("[a-zA-Z0-9_]{4,16}")
        && !username.matches("[0-9]+")){
        return true;
        } else {
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        // ここにコードを書いてください
        if (password.matches(".*[A-Z].*")
        && password.matches(".*[0-9].*")
        && password.matches(".{8,}")) {
        return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};
        //String[] usernames = {"abcd","abcdefghijklmnop","abc"};
        //String[] passwords ={"Abcdefg1","A1","VeryLongPassword123"};
        //String[] usernames = {"test_user","Player123","user_name_123"};
        //String[] passwords ={"MySecret1","StrongPass123","Validpassword9"};
        //String[] usernames = {"user-name","player!","999999"};
        //String[] passwords ={"mysecret1","weakpass123","lowercase9"};
        //String[] usernames = {"usr","verylongusernametest","a"};
        //String[] passwords ={"MySecret","StrongPass","NoNumbers"};
        //String[] usernames = {"test","abcdefghijklmnop"};
        //String[] passwords ={"Abcdefg1","A1bcdefg"};
        //String[] usernames = {"user@name","player#1","test$user"};
        //String[] passwords ={"Pass@123","Secret#1","Test$123"};


        // ここにテスト用のコードを書いてください

        System.out.println("ユーザー名チェック:");
        for (String username : usernames) {
            if (validateUsername(username)) {
            System.out.println(username + ": 有効");
            }else {
                System.out.println(username + ": 無効");
            }
        }

        System.out.println("パスワードチェック:");
        for (String password : passwords) {
            if (validatePassword(password)) {
            System.out.println(password + ": 有効");
            }else {
                System.out.println(password + ": 無効");
            }
        }

    }
}