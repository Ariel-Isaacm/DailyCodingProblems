package september19;

import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertTrue;

class AutoCompleteTest {

//    Implement an autocomplete system. That is, given a query string s and a set of all possible query strings,
//    return all strings in the set that have s as a prefix.
//    For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
    @Test
    void testTrieAutoComplete() {
        AutoComplete trie = new AutoComplete(new String[]{"dog", "deer", "deal", "car"});
        Set results = trie.getAutoComplete("do");
        assertTrue(results.contains("dog") && results.size() == 1);
        results = trie.getAutoComplete("de");
        assertTrue(results.contains("deer") && results.contains("deal") && results.size() == 2);
        results = trie.getAutoComplete("car");
        assertTrue(results.contains("car") && results.size() == 1);
        results = trie.getAutoComplete("doo");
        assertTrue(results.isEmpty());

    }
}