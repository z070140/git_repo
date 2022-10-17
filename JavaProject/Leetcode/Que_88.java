class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1,p2= n-1,tail=m+n-1;
        int cur ;
        while(p1>=0||p2>=0){  
            if (p1==-1){  //p1==-1但循环还在走，说明p2还没结束
                cur = nums2[p2--];
            }else if (p2==-1){
                cur = nums1[p1--];
            }else if (nums1[p1]>nums2[p2]){	//判断大小，将较大的一项存入nums1数组tail
                cur = nums1[p1--];
            }else{
                cur = nums2[p2--];
            }
            nums1[tail--] = cur;
        }
    }
    }
//有玩家都全力向前冲刺, 却不知道向后才是胜利之门。-《头号玩家》