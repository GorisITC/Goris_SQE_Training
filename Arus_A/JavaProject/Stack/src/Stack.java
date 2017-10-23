public class Stack {
        final int size;
        private int count=0;
        private String []zang;

        public Stack (int size) {
            if(size<=0) {
                throw new NegativeArraySizeException("Խնդրում ենք փոխել զանգվածի չափը։ Այն 0 կամ բացասական լինել չի կարող։");
            }
            if (size >=1000000000) {
                throw new OutOfMemoryError("Չափը գերազանցում է տրված տեսակի չափը։");
           }
            this.size=size;
            zang=new String[size];
        }
        
        public String push(String zang){
            if(!full()) {
                this.zang[count++] = zang;
            }
            else{
                System.out.println("Զգուշացում՝ զանգվածը լցված է։ Նշված չափից ավել մուտքագրել չեք կարող։");
                System.exit(size);
            }
            return zang;
        }
        public String peek(){
            if(count>0) {
                System.out.println("վերցրված է հետևյալ արժեքը 'peek' անելուց հետո։ ");
                return zang[count - 1];
            }
            else{
                return "Զգուշացում՝ զանգվածը դատարկ է։ 'peek' հրամանը հնարավոր չէ աշխատեցնել։";
            }
        }
      public String pop() {
        		if(count<=size && count>0) {
        		    System.out.println("վերցրված է հետևյալ արժեքը 'pop' անելուց հետո։ " + zang[count-1] + "\n");
        		    String last = zang[count-1];
        		    zang[count-1] = "";
        		    count--;
        		    return last;
        		}
                else{
                    return "Զգուշացում՝ զանգվածը դատարկ է։ 'pop' հրամանը հնարավոր չէ աշխատեցնել։";
                }
        }
        protected void tpelCurrentStack(){
            System.out.println("Զանգվածի պարունակությունը ներկա պահին հետևյալն է՝");
            for (int i = count - 1; i >= 0; i--) {
                System.out.println(zang[i]);
            }
        }
        protected void tpelGeneralInfo(){
              //  System.out.println("Զանգվածում վերջին մուտքագրված արժեքը հետևյալն է։ " + zang[count-1]);
                System.out.println("Զանգվածի հերթական համարը հետևյալն է՝ " + count);
                System.out.println("Զանգվածի չափը " + size + " է:");
                if (full()) {
                    System.out.println("Զանգվածը լցված է։\nԴատարկեք որոշակի տարածք, որպեսզի կարողանաք մուտքագրել նոր արժեք։\n");
                }
                if (empty()) {
                    System.out.println("Զանգվածը դատարկ է։ Կարող եք մուտքագրել մեկական արժեք։\n");
                }
        }
        private boolean empty(){
            return (count==0);
        }
        private boolean full(){
            return (count==size);
        }
}