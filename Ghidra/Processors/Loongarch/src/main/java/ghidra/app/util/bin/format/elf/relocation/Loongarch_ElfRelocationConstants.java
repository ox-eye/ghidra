/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.app.util.bin.format.elf.relocation;

public class Loongarch_ElfRelocationConstants {

	public static final int R_LARCH_NONE = 0;
	
	/* Runtime address resolving  */
	public static final int R_LARCH_32 = 1; // *(int32_t *)  PC = RtAddr + A
	public static final int R_LARCH_64 = 2; // *(int64_t *) PC = RtAddr + A
	
	public static final int R_LARCH_RELATIVE = 3; // Runtime fixup for load-address *(void **)  PC = B + A
	public static final int R_LARCH_COPY = 4; // Runtime memory copy in executable memcpy (PC, RtAddr, sizeof (sym))
	public static final int R_LARCH_JUMP_SLOT = 5; // Runtime PLT supporting (implementation defined)
	
	/* Runtime relocations for TLS-GD  */
	public static final int R_LARCH_TLS_DTPMOD32 = 6; // *(int32_t *)  PC = ID of module defining sym
	public static final int R_LARCH_TLS_DTPMOD64 = 7; // *(int64_t *) PC = ID of module defining sym
	public static final int R_LARCH_TLS_DTPREL32 = 8; // *(int32_t *)  PC = DTV-relative offset for sym
	public static final int R_LARCH_TLS_DTPREL64 = 9; // *(int64_t *) PC = DTV-relative offset for sym
	
	/* Runtime relocations for TLE-IE  */
	public static final int R_LARCH_TLS_TPREL32 = 10; // *(int32_t *) PC = T
	public static final int R_LARCH_TLS_TPREL64 = 11; // *(int64_t *) PC = T
	
	public static final int R_LARCH_IRELATIVE = 12; /* Runtime local indirect function resolving
	 												*(void **) PC = (((void *)(*)()) (B + A)) () */

	/* Relocations 13..19 reserved for dynamic linker  */

	public static final int R_LARCH_MARK_LA = 20; // Mark la.abs Load absolute address for static link.
	public static final int R_LARCH_MARK_PCREL = 21; // Mark external label branch Access PC relative address for static link.
	public static final int R_LARCH_SOP_PUSH_PCREL = 22; // Push PC-relative offset push (S - PC + A)
	public static final int R_LARCH_SOP_PUSH_ABSOLUTE = 23; // Push constant or absolute address push (S + A)
	public static final int R_LARCH_SOP_PUSH_DUP = 24; // Duplicate stack top opr1 = pop (), push (opr1), push (opr1)
	public static final int R_LARCH_SOP_PUSH_GPREL = 25; // Push for access GOT entry push (G)
	public static final int R_LARCH_SOP_PUSH_TLS_TPREL = 26; // Push for TLS-LE push (T)
	public static final int R_LARCH_SOP_PUSH_TLS_GOT = 27; // Push for TLS-IE push (IE)
	public static final int R_LARCH_SOP_PUSH_TLS_GD = 28; // Push for TLS-GD push (GD)
	public static final int R_LARCH_SOP_PUSH_PLT_PCREL = 29; // Push for external function calling push (PLT - PC)
	public static final int R_LARCH_SOP_ASSERT = 30; // Assert stack top assert (pop ())
	
	/* Stack top operations  */
	public static final int R_LARCH_SOP_NOT = 31;
	public static final int R_LARCH_SOP_SUB = 32;
	public static final int R_LARCH_SOP_SL = 33;
	public static final int R_LARCH_SOP_SR = 34;
	public static final int R_LARCH_SOP_ADD = 35;
	public static final int R_LARCH_SOP_AND = 36;
	public static final int R_LARCH_SOP_IF_ELSE = 37;
	
	/* Instruction imm-field relocation  */
	public static final int R_LARCH_SOP_POP_32_S_10_5 = 38;
	public static final int R_LARCH_SOP_POP_32_U_10_12 = 39;
	public static final int R_LARCH_SOP_POP_32_S_10_12 = 40;
	public static final int R_LARCH_SOP_POP_32_S_10_16 = 41;
	public static final int R_LARCH_SOP_POP_32_S_10_16_S2 = 42;
	public static final int R_LARCH_SOP_POP_32_S_5_20 = 43;
	public static final int R_LARCH_SOP_POP_32_S_0_5_10_16_S2 = 44;
	public static final int R_LARCH_SOP_POP_32_S_0_10_10_16_S2 = 45;
	
	/* Instruction fixup  */
	public static final int R_LARCH_SOP_POP_32_U = 46;
	
	/* n-bit in-place additions  */
	public static final int R_LARCH_ADD8 = 47;
	public static final int R_LARCH_ADD16 = 48;
	public static final int R_LARCH_ADD24 = 49;
	public static final int R_LARCH_ADD32 = 50;
	public static final int R_LARCH_ADD64 = 51;

	/* n-bit in-place subtractions  */
	public static final int R_LARCH_SUB8 = 52;
	public static final int R_LARCH_SUB16 = 53;
	public static final int R_LARCH_SUB24 = 54;
	public static final int R_LARCH_SUB32 = 55;
	public static final int R_LARCH_SUB64 = 56;
	
	
	public static final int R_LARCH_GNU_VTINHERIT = 57; // GNU C++ vtable hierarchy
	public static final int R_LARCH_GNU_VTENTRY = 58; // GNU C++ vtable member usage
	
	/* 59..63 reserved  */
	
	/* n-bit relative jumps  */
	public static final int R_LARCH_B16 = 64;
	public static final int R_LARCH_B21 = 65;
	public static final int R_LARCH_B26 = 66;
	
	public static final int R_LARCH_ABS_HI20 = 67; // [31 …​ 12] bits of 32/64-bit absolute address
	public static final int R_LARCH_ABS_LO12 = 68; // [11 …​ 0] bits of 32/64-bit absolute address
	public static final int R_LARCH_ABS64_LO20 = 69; // [51 …​ 32] bits of 64-bit absolute address
	public static final int R_LARCH_ABS64_HI12 = 70; // [63 …​ 52] bits of 64-bit absolute address
	public static final int R_LARCH_PCALA_HI20 = 71; // [31 …​ 12] bits of 32/64-bit PC-relative offset
	public static final int R_LARCH_PCALA_LO12 = 72; // [11 …​ 0] bits of 32/64-bit address
	public static final int R_LARCH_PCALA64_LO20 = 73; // [51 …​ 32] bits of 64-bit PC-relative offset
	public static final int R_LARCH_PCALA64_HI12 = 74; // [63 …​ 52] bits of 64-bit PC-relative offset
	
	public static final int R_LARCH_GOT_PC_HI20 = 75; // [31 …​ 12] bits of 32/64-bit PC-relative offset to GOT entry
	public static final int R_LARCH_GOT_PC_LO12 = 76; // [11 …​ 0] bits of 32/64-bit GOT entry address
	public static final int R_LARCH_GOT64_PC_LO20 = 77; // [51 …​ 32] bits of 64-bit PC-relative offset to GOT entry
	public static final int R_LARCH_GOT64_PC_HI12 = 78; // [63 …​ 52] bits of 64-bit PC-relative offset to GOT entry
	public static final int R_LARCH_GOT_HI20 = 79; // [31 …​ 12] bits of 32/64-bit GOT entry absolute address
	public static final int R_LARCH_GOT_LO12 = 80; // [11 …​ 0] bits of 32/64-bit GOT entry absolute address
	public static final int R_LARCH_GOT64_LO20 = 81; // [51 …​ 32] bits of 64-bit GOT entry absolute address
	public static final int R_LARCH_GOT64_HI12 = 82; // [63 …​ 52] bits of 64-bit GOT entry absolute address
	
	public static final int R_LARCH_TLS_LE_HI20 = 83; // [31 …​ 12] bits of TLS LE 32/64-bit offset from TP register
	public static final int R_LARCH_TLS_LE_LO12 = 84; // [11 …​ 0] bits of TLS LE 32/64-bit offset from TP register
	public static final int R_LARCH_TLS_LE64_LO20 = 85; // [51 …​ 32] bits of TLS LE 64-bit offset from TP register
	public static final int R_LARCH_TLS_LE64_HI12 = 86; // [63 …​ 52] bits of TLS LE 64-bit offset from TP register
	public static final int R_LARCH_TLS_IE_PC_HI20 = 87; // [31 …​ 12] bits of 32/64-bit PC-relative offset to TLS IE GOT entry
	public static final int R_LARCH_TLS_IE_PC_LO12 = 88; // [11 …​ 0] bits of 32/64-bit TLS IE GOT entry address
	public static final int R_LARCH_TLS_IE64_PC_LO20 = 89; // [51 …​ 32] bits of 64-bit PC-relative offset to TLS IE GOT entry
	public static final int R_LARCH_TLS_IE64_PC_HI12 = 90; // [63 …​ 52] bits of 64-bit PC-relative offset to TLS IE GOT entry
	public static final int R_LARCH_TLS_IE_HI20 = 91; // [31 …​ 12] bits of 32/64-bit TLS IE GOT entry absolute address
	public static final int R_LARCH_TLS_IE_LO12 = 92; // [11 …​ 0] bits of 32/64-bit TLS IE GOT entry absolute address
	public static final int R_LARCH_TLS_IE64_LO20 = 93; // [51 …​ 32] bits of 64-bit TLS IE GOT entry absolute address
	public static final int R_LARCH_TLS_IE64_HI12 = 94; // [63 …​ 52] bits of 64-bit TLS IE GOT entry absolute address
	public static final int R_LARCH_TLS_LD_PC_HI20 = 95; // [31 …​ 12] bits of 32/64-bit PC-relative offset to TLS LD GOT entry
	public static final int R_LARCH_TLS_LD_HI20 = 96; // [31 …​ 12] bits of 32/64-bit TLS LD GOT entry absolute address
	public static final int R_LARCH_TLS_GD_PC_HI20 = 97; // [31 …​ 12] bits of 32/64-bit PC-relative offset to TLS GD GOT entry
	public static final int R_LARCH_TLS_GD_HI20 = 98; // [31 …​ 12] bits of 32/64-bit TLS GD GOT entry absolute address
	
	public static final int R_LARCH_32_PCREL = 99; // 32-bit PC relative
	public static final int R_LARCH_RELAX = 100; // Instruction can be relaxed, paired with a normal relocation at the same address
	
	// The following are from binutils and not found in the official Loongarch documentation
	public static final int R_LARCH_DELETE = 101; // relax delete
	public static final int R_LARCH_ALIGN = 102; // relax delete
	public static final int R_LARCH_PCREL20_S2 = 103; // pcaddi
	public static final int R_LARCH_CFA = 104; // relax delete
	public static final int R_LARCH_ADD6 = 105; // relax delete
	public static final int R_LARCH_SUB6 = 106; // pcaddi
	public static final int R_LARCH_ADD_ULEB128 = 107; // relax delete
	public static final int R_LARCH_SUB_ULEB128 = 108; // relax delete
	public static final int R_LARCH_64_PCREL = 109; // pcaddi
	
	private Loongarch_ElfRelocationConstants() {
		// no construct
	}
}
