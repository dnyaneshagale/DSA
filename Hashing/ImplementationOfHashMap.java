import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementationOfHashMap {
    static class HashMap<K,V> {
        
        private class Node {
            K key;
            V value;
    
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Size of HashMap ( n )
        private int N; // Size of Bucket ( N )
        private LinkedList<Node> [] buckets;  

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.buckets = new LinkedList[4];  
            this.N = buckets.length;

            for(int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            int di = 0; // Data Index (Idx at which Key may exist)

            for(int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if(node.key == key) {
                    return di;         // Key Exists
                }
                di++;
            }

            return -1;   // Key don't exist
        }

        private void rehash() {
            LinkedList<Node> oldBucket [] = buckets;

            buckets = new LinkedList[2 * N];

            N = 2 * N;

            for(int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (LinkedList<Node> ll : oldBucket) {
                while (!ll.isEmpty()) {             // Remove nodes safely
                    Node node = ll.removeFirst();   // Remove and retrieve first node
                    put(node.key, node.value);      // Reinsert into new buckets
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1) {  // Key Exists
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = n/N;

            if(lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];

                for(Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public int size() {
            return n;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();

        hm.put("India", 150);
        hm.put("Pak", 50);
        hm.put("Bangladesh", 21);
        hm.put("Inia", 150);
        hm.put("Pk", 50);
        hm.put("Baladesh", 21);
        hm.put("Iia", 150);
        hm.put("Pk", 50);
        hm.put("Bsh", 21);
        hm.put("Ia", 150);
        hm.put("k", 50);
        hm.put("Baaesh", 21);

        System.out.println(hm.get("Pak"));
        System.out.println(hm.get("India") + "\n");

        System.out.println(hm.remove("Pak"));
        System.out.println(hm.remove("Bangladesh") + "\n");

        System.out.println(hm.containsKey("k"));
        System.out.println(hm.containsKey("Baaesh"));
        System.out.println(hm.containsKey("Chemma") + "\n");

        System.out.println(hm.isEmpty());
        HashMap<String, Integer> hm2 = new HashMap();
        System.out.println(hm2.isEmpty() + "\n");

        ArrayList<String> keys = hm.keySet();
        for(String key : keys) {
            System.out.print(key + "  ");
        }

    }
}
