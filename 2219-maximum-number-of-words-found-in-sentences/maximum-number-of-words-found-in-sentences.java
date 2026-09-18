class Solution {
    public int mostWordsFound(String[] sentences) {
        int count =0;
        for(int i=0;i<sentences.length;i++){
          int W_length=  sentences[i].split(" ").length ;
          if(W_length>count) count = W_length;
        }
        return count;
    }
}