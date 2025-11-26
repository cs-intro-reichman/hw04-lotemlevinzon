public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[] newSentences = new String[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            String lowcaseSentences = ""; 
             for(int j = 0; j < sentences[i].length(); j++) {
            char c = sentences[i].charAt(j);
            if ((char)sentences[i].charAt(j) <= 90 && sentences[i].charAt(j) >= 65) {
               lowcaseSentences  = lowcaseSentences  + (char)(sentences[i].charAt(j) + 32); 
            } else {
                lowcaseSentences  = lowcaseSentences  + c;
            }
        }  newSentences[i] = lowcaseSentences;
         } 
         
String[] newKeywords = new String[keywords.length];
        for (int i = 0; i < keywords.length; i++) {
            String lowcaseKeywords = ""; 
             for(int j = 0; j < keywords[i].length(); j++) {
            char c = keywords[i].charAt(j);
            if ((char)keywords[i].charAt(j) <= 90 && keywords[i].charAt(j) >= 65) {
               lowcaseKeywords  = lowcaseKeywords  + (char)(keywords[i].charAt(j) + 32); 
            } else {
                lowcaseKeywords  = lowcaseKeywords  + c;
            }
        }  newKeywords[i] = lowcaseKeywords;
         } 

        for (int i = 0; i < newSentences.length; i++) {
        for (int j = 0; j < newKeywords.length; j++) {
            for (int k = 0; k <= newSentences[i].length() - newKeywords[j].length(); k++){ 
                boolean same = true;
                for (int l = 0; l < newKeywords[j].length(); l++)  {
             if (newSentences[i].charAt(k + l) != newKeywords[j].charAt(l)) {
                same = false;
                break;
               }  
        } 
        if (same) {
                System.out.println(newSentences[i]);
                break;
               }          
    } 
            } 
        }
    } 
}


