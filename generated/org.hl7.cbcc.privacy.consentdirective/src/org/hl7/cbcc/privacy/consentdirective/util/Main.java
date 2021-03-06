/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.hl7.cbcc.privacy.consentdirective.util;

import java.io.FileInputStream;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.mdht.uml.cda.util.CDAUtil;
import org.eclipse.mdht.uml.cda.util.ValidationResult;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;

public class Main {
	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("Usage FileToBeValidate");
			return;
		}

		CONSENTDIRECTIVEPackage.eINSTANCE.getComputablePolicyConsent();

		CDAUtil.loadPackages();

		// create a validation result object to collect diagnostics produced during validation
		ValidationResult result = new ValidationResult();
		CDAUtil.load(new FileInputStream(args[0]), result);

		System.out.println("\n***** Consent Directive validation results *****");
		for (Diagnostic diagnostic : result.getErrorDiagnostics()) {
			System.out.println("ERROR: " + diagnostic.getMessage());
		}
		for (Diagnostic diagnostic : result.getWarningDiagnostics()) {
			System.out.println("WARNING: " + diagnostic.getMessage());
		}

		System.out.println(
			"Number of Schema Validation Diagnostics: " + result.getSchemaValidationDiagnostics().size());
		System.out.println("Number of EMF Resource Diagnostics: " + result.getEMFResourceDiagnostics().size());
		System.out.println("Number of EMF Validation Diagnostics: " + result.getEMFValidationDiagnostics().size());
		System.out.println("Number of Total Diagnostics: " + result.getAllDiagnostics().size());

		if (!result.hasErrors()) {
			System.out.println("Document is valid");
		} else {
			System.out.println("Document is invalid");
		}
	}
}
