import java.io.*;
public class BlockChain {
    public static final String POS = "Proof of Stake";
    public static final String POW = "Proof of Work";

    public String name;
    public String coin;
    public long totalSupply;

    public BlockChain(String _name, String _coin) {
        name = _name;
        coin = _coin;

    }
    public static void main(String args[]) {
        BlockChain eth = new BlockChain("ethereum", "ETH");
        System.out.println(eth.name + " " + eth.coin);
        System.out.printf("2 common consensuses are %s and %s", BlockChain.POW, BlockChain.POS);
    }
}
