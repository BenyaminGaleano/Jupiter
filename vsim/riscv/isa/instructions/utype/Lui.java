package vsim.riscv.isa.instructions.utype;


public final class Lui extends UType {

    @Override
    protected int compute(int imm) {
        return (imm << 20) & 0xfffff000;
    }

}