package Credentials;

public class SearchQueries {

    private String andOperator = "love AND tears";
    private String notOperator = "love not tears";
    private String orOperator = "fire and not eyes";
    private String wAndAsteriskOperator = "thing* and w/3 lost";
    private String andNotOperator = "things w/1 xfirstword";
    private String questionMarkOperator = "pompei?";
    private String equalOperator = "ccitt_=";
    private String ampersandOperator = "fast&";
    private String noiseWordsOperator = "a about after all also an and another any are as at be because been before being between both but by came can come could did do each even for from further furthermore get got had has have he her here hi him himself how however i if in indeed into is it its just like made many me might more moreover most much must my never not now of on only or other our out over take than that the their them then there therefore these they this those through thus to too under up very was way we well were what when where which while who will with would you your";

    public String getAndOperator() {
        return andOperator;
    }

    public String getNotOperator() {
        return notOperator;
    }

    public String getOrOperator() {
        return orOperator;
    }

    public String getwAndAsteriskOperator() {
        return wAndAsteriskOperator;
    }

    public String getAndNotOperator() {
        return andNotOperator;
    }

    public String getQuestionMarkOperator() {
        return questionMarkOperator;
    }

    public String getEqualOperator() {
        return equalOperator;
    }

    public String getAmpersandOperator() {
        return ampersandOperator;
    }

    public String getNoiseWordsOperator() {
        return noiseWordsOperator;
    }
}
