// Last updated: 7/15/2026, 3:16:09 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3    	  HashMap <String, Integer> map = new HashMap<>();
4    	  for(String word: words) {
5    		  map.put(word,map.getOrDefault(word,0)+1 );
6    	  }
7    	  List<String> List = new ArrayList<>(map.keySet());
8    	  Collections.sort(List,(a,b)->{
9    		  if(map.get(a).equals(map.get(b))) 
10    			  return a.compareTo(b);
11    			  return map.get(b)-map.get(a);
12    		  });
13              return List.subList(0,k);
14    }
15}