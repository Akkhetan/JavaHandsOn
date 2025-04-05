package J_Stream.testPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Interview_CandidatesMain {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Candidates> candidatesList=new ArrayList<>();

        int n=Integer.parseInt(br.readLine().trim());

        for(int i=0;i<n;i++)
        {
            String inp=br.readLine();
            String inparr[]=inp.split("-");

            Candidates cnd=new Candidates( inparr[0], inparr[1], Integer.parseInt(inparr[2]) );
            candidatesList.add(cnd);
        }


        Interview_Candidates ic=new Interview_Candidates();

        boolean ans= ic.areNatives(candidatesList);
        if(ans)
            System.out.println("All candidates are Natives");
        else
            System.out.println("All candidates are not Natives");

        ic.youngestCandidate(candidatesList);
        Candidates youngest=ic.youngestCandidate(candidatesList);

        System.out.println("Details of the Candidate with youngest age : Name = "+youngest.name+", Locality = "+youngest.locality+", Age = "+youngest.age);
    }
}
