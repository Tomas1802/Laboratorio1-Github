import java.security.SecureRandom;

public class PasswordGenerator_LuisMendez {


    public static String generate(int len){
        String data ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%^&*/*!";

        SecureRandom random = new SecureRandom();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < len; i++) {
            int random_index = random.nextInt(data.length());
            builder.append(data.charAt(random_index));
        }

        return builder.toString();
    }

}
