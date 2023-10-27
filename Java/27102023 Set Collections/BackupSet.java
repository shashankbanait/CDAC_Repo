import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BackupSet{
    public static void main(String[] args) {
        Set<Integer> originalSet = new HashSet<>();
        originalSet.add(100);
        originalSet.add(200);
        originalSet.add(300);

        System.out.println(originalSet);

        Set<Integer> backupSet = Collections.unmodifiableSet(new HashSet<>(originalSet));
        System.out.println(backupSet);

        try {
            originalSet.add(400);
        } catch (Exception e) {
            System.out.println("Don't know the answer");
        }
        System.out.println(originalSet);

    }
}