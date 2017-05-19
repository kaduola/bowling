
public class BowlingGame {
	
	
	public static int getBowlingScore(String bowlingCode) {
		int length = bowlingCode.length();
		int sum =0;
		int count =0;
		int first =0;
		int second =0;
		int i=0;
		while(i<length){
			if( "X".equals(bowlingCode.charAt(i)+"")){
				i += 2;
				if( "X".equals(bowlingCode.charAt(i)+"")){
					sum += 20;
					if(count ==8){
						i++;
					}
					if( "X".equals(bowlingCode.charAt(i+2)+"")){
						sum += 10;
					}else{
						if("-".equals(bowlingCode.charAt(i+2)+"")){
							first = 0;
						}else{
							first = Integer.valueOf(bowlingCode.charAt(i+2)+"");
						}
						sum += first;
					}
					if(count ==8){
						i--;
					}
				}else if("/".equals(bowlingCode.charAt(i+1)+"")){
					sum += 20;
				}else{
					if("-".equals(bowlingCode.charAt(i)+"")){
						first = 0;
					}else{
					    first = Integer.valueOf(bowlingCode.charAt(i)+"");
					}
					if("-".equals(bowlingCode.charAt(i+1)+"")){
						second = 0;
					}else{
						second = Integer.valueOf(bowlingCode.charAt(i+1)+"");
					}
					sum += (10 + first + second);
				}
			}else if("/".equals(bowlingCode.charAt(i+1)+"")){
				i +=3;
				if( "X".equals(bowlingCode.charAt(i)+"")){
					sum += 20;
				}else{
					if("-".equals(bowlingCode.charAt(i)+"")){
						first = 0;
					}else{
					    first = Integer.valueOf(bowlingCode.charAt(i)+"");
					}
					sum += (10 + first);
				}
			}else{
				if("-".equals(bowlingCode.charAt(i)+"")){
					first = 0;
				}else{
				    first = Integer.valueOf(bowlingCode.charAt(i)+"");
				}
				if("-".equals(bowlingCode.charAt(i+1)+"")){
					second = 0;
				}else{
					second = Integer.valueOf(bowlingCode.charAt(i+1)+"");
				}
				sum += ( first + second);
				i +=3;
			}
			count++;
			if(count == 9){
				break;
			}
		}
		if( "X".equals(bowlingCode.charAt(i)+"")){
			i += 3;
			if( "X".equals(bowlingCode.charAt(i)+"")){
				sum += 20;
				if( "X".equals(bowlingCode.charAt(i+1)+"")){
					sum += 10;
				}else{
					if("-".equals(bowlingCode.charAt(i)+"")){
						second = 0;
					}else{
						second = Integer.valueOf(bowlingCode.charAt(i)+"");
					}
					sum += second;
				}
			}else if("/".equals(bowlingCode.charAt(i+1)+"")){
				sum += 20;
			}else{
				if("-".equals(bowlingCode.charAt(i)+"")){
					first = 0;
				}else{
				    first = Integer.valueOf(bowlingCode.charAt(i)+"");
				}
				if("-".equals(bowlingCode.charAt(i+1)+"")){
					second = 0;
				}else{
					second = Integer.valueOf(bowlingCode.charAt(i+1)+"");
				}
				sum += (10 + first + second);
			}
		}else if("/".equals(bowlingCode.charAt(i+1)+"")){
			i += 4;
			if( "X".equals(bowlingCode.charAt(i)+"")){
				sum += 20;
			}else{
				if("-".equals(bowlingCode.charAt(i)+"")){
					first = 0;
				}else{
					first = Integer.valueOf(bowlingCode.charAt(i)+"");
				}
				sum += (10 +first);
			}
		}else{
			if("-".equals(bowlingCode.charAt(i)+"")){
				first = 0;
			}else{
			    first = Integer.valueOf(bowlingCode.charAt(i)+"");
			}
			if("-".equals(bowlingCode.charAt(i+1)+"")){
				second = 0;
			}else{
				second = Integer.valueOf(bowlingCode.charAt(i+1)+"");
			}
			sum += ( first + second);
		}
        return sum;
    }
}
