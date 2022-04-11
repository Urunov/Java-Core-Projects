package uz.bepro.academy;

/**
 * @Company: {}
 * @Author: {urunov}
 * @Project: {lessonOOPs}
 * @Date: {2022/03/28 && 3:29 PM}
 */
public class Country {
    //
    public String name;
    public String capital;
    public String currency;
    public String language;
    public double population;
    public String flag;
    String history; // default

    public static double area = 334.23;

    protected String secretDocument;

    public String toPrint(){ // method
        // logic
        return "Country  : " + name +
                    " capital:  " +capital +
                    "  currency " + currency +
                    "  language:  " + language+
                    " population = " + population +
                    " area = " + area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", currency='" + currency + '\'' +
                ", language='" + language + '\'' +
                ", population=" + population +
                ", flag='" + flag + '\'' +
                ", secretDocument='" + secretDocument + '\'' +
                '}';
    }
}

/**\
 *  private
 *  default
 *  protected
 *  public
 *
 *
 *
 * */