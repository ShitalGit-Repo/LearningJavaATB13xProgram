package ex_27_Enum;

public enum APIURL {
    VWO("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIURL (String url){
        this.url = url;
    }
    String getUrl(){
        return this.url;
    }
}
