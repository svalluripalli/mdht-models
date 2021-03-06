/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.toc.domain.test;

import org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCFactory;
import org.openhealthtools.mdht.uml.cda.toc.domain.IConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

public class TestConsultationSummary extends TestToCDocument {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ConsultationSummary consultationSummaryImpl = ToCFactory.eINSTANCE.createConsultationSummary().init();
		IConsultationSummary consultationSummary = IDomainFactory.eINSTANCE.createConsultationSummary();
		consultationSummary.setCDAType(consultationSummaryImpl);

		createHeader(consultationSummary);

		createActiveProblems(consultationSummary.withActiveProblems());
		createAllergies(consultationSummary.withAllergies());
		createPlanOfCare(consultationSummary.withPlanOfCare());
		createDiagnosticResults(consultationSummary.withDiagnosticResults());

		System.out.println();
		save(consultationSummary.getCDAType());

		System.out.println();
		System.out.println();
		validate(consultationSummary.getCDAType());

	}

	public static void createHeader(IConsultationSummary doc) {
		doc.withId().setRoot("2.16.840.1.113883.3.72");

		II typeId = doc.withTypeId();
		typeId.setRoot("2.16.840.1.113883.1.3");
		typeId.setExtension("POCD_HD000040");

		doc.withEffectiveTime().setValue("20110804103022-0500");

		doc.withLanguageCode().setCode("en-US");

		doc.withTitle().addText("ToC RI Consultation Summary");

		CE confCode = DatatypesFactory.eINSTANCE.createCE("N", "2.16.840.1.113883.5.25");
		doc.setConfidentialityCode(confCode);

		CE code = DatatypesFactory.eINSTANCE.createCE(
			"?????-?", "2.16.840.1.113883.6.1", "LOINC", "Consultation Summary");
		doc.setCode(code);

		addPatient(doc.addRecordTarget());
		addOriginalAuthor(doc.addAuthor());
		addDocumentCustodian(doc.withCustodian());
	}

}
