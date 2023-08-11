package homeWork1.main;

public class MainFileServise {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        String str1 = fileService.getFirstLineForFile("scr/main/MainFileService.java");
        String str2 = fileService.getFirstLineForFile("scr/MainFileService.java");

        System.out.println(str1);
        System.out.println(str2);
    }
}
