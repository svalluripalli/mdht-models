/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.anthrax;

import java.lang.Iterable;
import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage#getAnthraxResultObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='AnthraxResultObservationTemplateId AnthraxResultObservationCode AnthraxResultObservationCodeP' templateId.root='2.16.840.1.113883.10.20.15.3.39' code.codeSystem='2.16.840.1.113883.6.1' code.codeSystemName='LOINC' constraints.validation.dependOn.AnthraxResultObservationCode='AnthraxResultObservationCodeP'"
 * @generated
 */
public interface AnthraxResultObservation extends ResultObservation {
	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
   * @generated
   */
  boolean validateAnthraxResultObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '11468-6' or value.code = '33697-4' or value.code = '22866-8' or value.code = '22867-6' or value.code = '51976-9' or value.code = '44269-9' or value.code = '33698-2' or value.code = '44270-7' or value.code = '11469-4' or value.code = '17928-3' or value.code = '17915-0' or value.code = '622-1' or value.code = '21020-3' or value.code = '41622-2'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and \nlet value : datatypes::CD = self.code.oclAsType(datatypes::CD) in \nvalue.codeSystem = \'2.16.840.1.113883.6.1\' and (value.code = \'11468-6\' or value.code = \'33697-4\' or value.code = \'22866-8\' or value.code = \'22867-6\' or value.code = \'51976-9\' or value.code = \'44269-9\' or value.code = \'33698-2\' or value.code = \'44270-7\' or value.code = \'11469-4\' or value.code = \'17928-3\' or value.code = \'17915-0\' or value.code = \'622-1\' or value.code = \'21020-3\' or value.code = \'41622-2\'))'"
   * @generated
   */
  boolean validateAnthraxResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context);
} // AnthraxResultObservation
