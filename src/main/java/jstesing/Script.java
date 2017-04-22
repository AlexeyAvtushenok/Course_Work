package jstesing;



import java.io.File;

public abstract class Script {

    private File file;
    private String jsText;
    private String path;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getJsText() {
        return jsText;
    }

    public void setJsText(String jstext) {
        this.jsText = jstext;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
