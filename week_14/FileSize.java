import java.io.File;

class FileInfo {
    String fileName;
    int fileLength;

    public FileInfo() {
        this.fileLength = 0;
        this.fileName = "";
    }

    protected void setFileInfoData(String fileName, int fileLength) {
        this.fileLength = fileLength;
        this.fileName = fileName;
    }

    protected void printFileInfo() {
        System.out.println(this.fileName + " " + this.fileLength + "바이트");
    }

}

public class FileSize {

    public static void main(String[] args) throws Exception {
        File floder = new File("sample");
        File[] subFiles = floder.listFiles();

        FileInfo maxFileInfo = new FileInfo();

        for (int i = 0; i < subFiles.length; i++) {
            if (maxFileInfo.fileLength < subFiles[i].length()) {
                maxFileInfo.setFileInfoData(subFiles[i].getPath(), (int) subFiles[i].length());
            }
        }
        System.out.print("가장 큰 파일은 ");
        maxFileInfo.printFileInfo();

    }
}
