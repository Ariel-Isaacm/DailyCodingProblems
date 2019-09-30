package september19;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AutoComplete {
    private Node root;
    public AutoComplete(String[] dictionary){
        Node currentNode;
        root = new Node();
        //O(n*s) where n is the number of words in the dictionary and s is the length of the biggest string in the array
        for (String s : dictionary) {
            currentNode = root;
            char[] charWord = s.toCharArray();
            for (char c : charWord) {
                if (currentNode._mappedNodes.containsKey(c)) {
                    currentNode = currentNode._mappedNodes.get(c);
                } else {
                    Node newNode = new Node();
                    currentNode._mappedNodes.put(c, newNode);
                    currentNode = newNode;
                }
            }
            currentNode.isCompleteWord = true;
        }
    }

    private class Node {
        HashMap<Character, Node> _mappedNodes = new HashMap<>();
        boolean isCompleteWord = false;
    }

    public Set getAutoComplete(String candidate){
        if (root == null) {
            return Collections.EMPTY_SET;
        }
        Node currentNode = root;
        Set<String> autoComplete = new HashSet<>();
        for (char c : candidate.toCharArray()) {
            if (currentNode._mappedNodes.containsKey(c)){
                currentNode = currentNode._mappedNodes.get(c);
            } else{
                return Collections.EMPTY_SET;
            }
        }

        if (currentNode.isCompleteWord && currentNode._mappedNodes.isEmpty()){
            autoComplete.add(candidate);
            return autoComplete;
        }
        currentNode._mappedNodes.forEach((key, value) -> getWordOfChild(value, candidate + key, autoComplete));

        return autoComplete;
    }

    private void getWordOfChild(Node current, String wordSoFar, Set<String> autoComplete){
        if (current.isCompleteWord){
            autoComplete.add(wordSoFar);
        } else {
            current._mappedNodes.forEach((key, value) -> getWordOfChild(value, wordSoFar + key, autoComplete));
        }
    }
}


