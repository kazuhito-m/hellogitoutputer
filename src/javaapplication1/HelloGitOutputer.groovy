package javaapplication1

/**
 *にほんごご
 * @author kazuhito
 */
class HelloGitOutputer {
    
    static List<String> buff = []
    
    static void main(String[] s) {
        gitOutputLogic()
    }
    
    static void gitOutputLogic() {
        printlnB 'miura'
        printlnB 'stadying git command ! lets Develop!'
    }
    
    static void printlnB(String s) {
        buff << s
        println s
    }
}
