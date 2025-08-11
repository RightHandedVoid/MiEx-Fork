/*
 * BSD 3-Clause License
 * 
 * Copyright (c) 2024, Bram Stout Productions
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * 3. Neither the name of the copyright holder nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package nl.bramstout.mcworldexporter;

public enum ColorGamut {
	
	sRGB(	1f, 0f, 0f,
			0f, 1f, 0f,
			0f, 0f, 1f),
	ACEScg( 0.6131f, 0.3395f, 0.0474f,
			0.0702f, 0.9164f, 0.0134f,
			0.0206f, 0.1096f, 0.8698f),
	LOOCSG2(0.634533540898306f, 0.32977634261913447f, 0.03569011648255932f,
			0.0650591748685295f, 0.9000022563772223f, 0.03493856875424817f,
			0.016500175883108165f, 0.08941001940767221f, 0.8940898047092195f);
	
	
	public float r0, r1, r2, g0, g1, g2, b0, b1, b2;

	private ColorGamut(float r0, float r1, float r2, float g0, float g1, float g2, float b0, float b1, float b2) {
		this.r0 = r0;
		this.r1 = r1;
		this.r2 = r2;
		this.g0 = g0;
		this.g1 = g1;
		this.g2 = g2;
		this.b0 = b0;
		this.b1 = b1;
		this.b2 = b2;
	}
	
}
