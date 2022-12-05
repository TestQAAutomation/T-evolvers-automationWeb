package co.com.tevolvers.test.enums;

public enum Resourses {
    USER("user"),
    URL_BASE("url_home_page"),
    ;

    private String resourses;
    Resourses(String resourses){this.resourses = resourses;}

    public String getResourses(){return resourses;}
}
