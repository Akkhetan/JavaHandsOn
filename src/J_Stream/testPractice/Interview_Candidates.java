package J_Stream.testPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interview_Candidates {
    boolean areNatives(ArrayList<Candidates> candidatesList)
    {
        //System.out.println("List : "+candidatesList);
        boolean answer = candidatesList.stream().map(Candidates::getLocality).allMatch(s -> s.contains("Native"));
        return answer;
    }

    Candidates youngestCandidate(ArrayList<Candidates> candidatesList)
    {
        List<Candidates> nativeCandidateslist = candidatesList.stream().filter(s -> s.getLocality().contains("Native"))
                .sorted(Comparator.comparingInt(Candidates::getAge))
                .toList();

        return nativeCandidateslist.get(0);

    }
}
