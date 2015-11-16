package trie;

class TrieNode {
    // Initialize your data structure here.
    
    public TrieNode [] links;
    public int count;
    
    public TrieNode() {
        links = new TrieNode[26];

        count = 0;
        
        
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        int i;
        int index;
        TrieNode current;
        //TrieNode 
        
        
        current = root;
        
        for (i = 0; i < word.length(); i++){
            
            index = word.charAt(i) - 'a';
            
            if (current.links[index] == null){
                
                current.links[index] = new TrieNode();
                
            }
            current = current.links[index];
        }
        
        current.count++;
        
        
        
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        int i;
        int index;

        TrieNode current;

        
        
        current = root;
        index = -1;
        
        
        for (i = 0; i < word.length(); i++){
            index = word.charAt(i) - 'a';
            
            if (current.links[index] == null){
                break;
            }
            current =current.links[index];
        }
        
        return (i == word.length()) && current.count != 0;
        
        
        
        
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
       int i;
       int index;

       TrieNode current;

        
        
        current = root;
        index = -1;
        
        for (i = 0; i < prefix.length(); i++){
            index = prefix.charAt(i) - 'a';
            
            if (current.links[index] == null){
                break;
            }
            current = current.links[index];
        }
        
        return (i == prefix.length());        
        
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
