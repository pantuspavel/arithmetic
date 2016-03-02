  private static int squareWithoutMultiplication(int v) {
    /*
    int rez = 1;
    int prev = 1;
    
    for (int i = 1; i < v; i++) {
      prev += 2;
      rez += prev;
    }
    return rez;
    */
    int r = 0;
    for (int i = 0; i < v; i++) {
      r += v;
    }
    return r;
  }
  
  private static double squareRoot(int num) {
    double sqrt = num / 2;
    double t = 0;
    
    do {
      t = sqrt;
      sqrt = (sqrt + num / sqrt) / 2.0;
    } while(sqrt != t);
    
    return sqrt;
  }
