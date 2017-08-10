class Nvazman {
      public static void main(String[] args) {
          int abc = 296;
          int a = (abc / 100);
          int b = ((abc / 10) % 10);
          int c = (abc % 10);
          if (a > b && c > a) {
              System.out.println(c+","+a+","+b);}
          else {
                  if (b > a && c > b) {
                      System.out.println(c+","+b+","+a);
                  } else {
                      if (a > c && b > a) {
                          System.out.println(b+","+a+","+c);
                      } else {
                          if (c > a && b > c) {
                              System.out.println(b +","+c+","+a);
                          } else {
                              if (b > c && a > b) {
                                  System.out.println(a+","+b+","+c);
                              } else {
                                  System.out.println(a+","+b+","+c);
                              }
                          }
                      }
                  }
              }
          }
                              }


