package Credentials;

public class SearchQueries {
    private String andOperator(){
        String andOperator = "love AND tears";
        return andOperator;
    }
    private String notOperator(){
        String notOperator = "love not tears";
        return notOperator;
    }
    private String orOperator(){
        String orOperator = "fire and not eyes";
        return orOperator;
    }
    private String wAndAsteriskOperator(){
        String wAndAsteriskOperator = "thing* and w/3 lost";
        return wAndAsteriskOperator;
    }
    private String xFirtWordOperator(){
        String andNotOperator = "things w/1 xfirstword";
        return andNotOperator;
    }
    private String questionMarkOperator(){
        String questionMarkOperator = "pompei?";
        return questionMarkOperator;
    }
    private String equalOperator(){
        String equalOperator = "ccitt_=";
        return equalOperator;
    }
    private String ampersandOperator(){
        String ampersandOperator = "fast&";
        return ampersandOperator;
    }
     private String noiseWordsOperator(){
            String noiseWordsOperator = "a about after all also an and another any are as at be because been before being between both but by came can come could did do each even for from further furthermore get got had has have he her here hi him himself how however i if in indeed into is it its just like made many me might more moreover most much must my never not now of on only or other our out over take than that the their them then there therefore these they this those through thus to too under up very was way we well were what when where which while who will with would you your";
            return noiseWordsOperator;
        }

}
