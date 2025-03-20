class Settings {
    private static Settings instance = null;
    private String theme;
    private String language;
    private Settings() {
        theme = "Default";
        language = "English";
    };

    public static synchronized Settings getInstance() {
        if(instance == null) {instance = new Settings();}
        return instance;
    }
    String getTheme() {return theme;}
    void setTheme(String theme) {this.theme = theme;}
    String getLanguage() {return language;}
    void setLanguage(String language) {this.language = language;}
}
class App {
    public void printAppSettings() {
        Settings appSettings = Settings.getInstance();
        System.out.println("App settings: ");
        System.out.println("Theme: " + appSettings.getTheme());
        System.out.println("Language: " + appSettings.getLanguage());
    }
}
class UserPreference {
    public void changeUserTheme(String theme) {
        Settings settings = Settings.getInstance();
        settings.setTheme(theme);
    }
    public void printUserSetting() {
        Settings settings = Settings.getInstance();
        System.out.println("User settings: ");
        System.out.println("Theme: " + settings.getTheme());
        System.out.println("Language: " + settings.getLanguage());
    }
}
public class Singleton4 {
    public static void main(String[] args) {
        App myApp = new App();
        UserPreference userPref = new UserPreference();

        myApp.printAppSettings();
        System.out.println("\n");
        userPref.printUserSetting();

        userPref.changeUserTheme("Dark");
        System.out.println("\n");
        userPref.printUserSetting();
        myApp.printAppSettings();
    }
}
