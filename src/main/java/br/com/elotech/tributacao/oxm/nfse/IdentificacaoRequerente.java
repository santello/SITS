/* 
 * Copyright 2016 ELOTECH GESTAO PUBLICA LTDA
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */

package br.com.elotech.tributacao.oxm.nfse;

public class IdentificacaoRequerente {

	private CpfCnpj cpfCnpj;

	private String inscricaoMunicipal;

	private String senha;

	private Boolean homologa;

	public Boolean getHomologa() {
		return homologa;
	}

	public void setHomologa(Boolean homologa) {
		this.homologa = homologa;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public CpfCnpj getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(CpfCnpj cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IdentificacaoRequerente [cpfCnpj=");
		builder.append(cpfCnpj);
		builder.append(", inscricaoMunicipal=");
		builder.append(inscricaoMunicipal);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", homologa=");
		builder.append(homologa);
		builder.append("]");
		return builder.toString();
	}

}
