public class Sum {
    void tong(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    void tong2(int n){
        int sum2=0;
        for(int i=0; i<=n; i++){
            sum2+=i*i;
        }
        System.out.println(sum2);
    }

    void tong3(int n){
        float sum3=0.f;
        for(float i=1.f; i<=n; i++){
            sum3+=1/i;
        }
        System.out.println(sum3);
    }

    void tong4(int n){
        float sum4=0.f;
        for(float i=1.f; i<=n; i++){
            sum4+=1/(2*i);
        }
        System.out.println(sum4);
    }

    void tong5(int n){
        float sum5=0.f;
        for(float i=0.f; i<=n; i++){
            sum5+=1/(2*i+1);
        }
        System.out.println(sum5);
    }

    void tong6(int n){
        float sum6=0.f;
        for(float i=1.f; i<=n; i++){
            sum6+=1/(i*(i+1));
        }
        System.out.println(sum6);
    }

    void tong7(int n){
        float sum7=0.f;
        for(float i=0.f; i<=n; i++){
            sum7+=i/(i+1);
        }
        System.out.println(sum7);
    }
}
