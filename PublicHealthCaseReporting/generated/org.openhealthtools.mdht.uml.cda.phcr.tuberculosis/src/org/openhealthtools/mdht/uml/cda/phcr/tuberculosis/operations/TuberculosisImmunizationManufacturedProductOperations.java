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
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ProductOperations;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.util.TuberculosisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Manufactured Product</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisImmunizationManufacturedProduct#validateProductTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TuberculosisImmunizationManufacturedProductOperations extends ProductOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TuberculosisImmunizationManufacturedProductOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProductTemplateId(TuberculosisImmunizationManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProductTemplateId(TuberculosisImmunizationManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.61')";

  /**
	 * The cached OCL invariant for the '{@link #validateProductTemplateId(TuberculosisImmunizationManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProductTemplateId(TuberculosisImmunizationManufacturedProduct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.61')
	 * @param tuberculosisImmunizationManufacturedProduct The receiving '<em><b>Immunization Manufactured Product</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateProductTemplateId(TuberculosisImmunizationManufacturedProduct tuberculosisImmunizationManufacturedProduct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TuberculosisPackage.Literals.TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT);
			try {
				VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tuberculosisImmunizationManufacturedProduct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TuberculosisValidator.DIAGNOSTIC_SOURCE,
						 TuberculosisValidator.TUBERCULOSIS_IMMUNIZATION_MANUFACTURED_PRODUCT__PRODUCT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProductTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tuberculosisImmunizationManufacturedProduct, context) }),
						 new Object [] { tuberculosisImmunizationManufacturedProduct }));
			}
			 
			return false;
		}
		return true;
	}

} // TuberculosisImmunizationManufacturedProductOperations