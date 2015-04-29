/*******************************************************************************
 * Copyright (c) 2014 Dan Brown and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dan Brown (Audacious Inquiry) - initial API and implementation
 *									 - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedure2Operations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Procedure2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2InstructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Instructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2CodeCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Code Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2CodeSuggestedCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Code Suggested Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2ServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Service Delivery Location Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureIndication2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Indication2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureMedicationActivity2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Medication Activity2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureInstruction2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2AuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2ReactionObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Reaction Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Procedure Activity Performer Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Procedure Activity Performer Procedure Activity Procedure Procedure Activity Performer Procedure Activity Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedure2ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure2 Procedure Activity Procedure Procedure Activity Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#getConsolIndication2s() <em>Get Consol Indication2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#getConsolMedicationActivity2s() <em>Get Consol Medication Activity2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#getConsolInstruction2() <em>Get Consol Instruction2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#getReactionObservation2s() <em>Get Reaction Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedureSpecimen(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Specimen</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2#validateProcedureActivityProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Performer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityProcedure2Test extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2InstructionsInversion() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2InstructionsInversionTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2InstructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_INSTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityProcedure2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
						target.getEntryRelationships().add(er);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ProcedureActivityProcedure2 target) {
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
						er.setInversionInd(false);
						er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
						target.getEntryRelationships().add(er);
					}
				});
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2InstructionsInversion(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2InstructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2CodeCodeSystems() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2CodeCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2CodeCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_CODE_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityProcedure2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", LOINC_ID));
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityProcedure2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", SNOMEDCT_ID));
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2CodeCodeSystems(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2CodeCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2CodeSuggestedCodeSystems() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2CodeSuggestedCodeSystemsTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2CodeSuggestedCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_CODE_SUGGESTED_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityProcedure2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.12"));
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityProcedure2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.4"));
					}
				});
				addPassTest(new PassTest() {
					@Override
					public void updateToPass(ProcedureActivityProcedure2 target) {
						target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.13"));
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2CodeSuggestedCodeSystems(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2CodeSuggestedCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2ServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2ServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2ServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p);
				p.setParticipantRole(ConsolFactory.eINSTANCE.createServiceDeliveryLocation().init());
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.getParticipants().get(0).setTypeCode(ParticipationType.LOC);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2ServiceDeliveryLocationTypeCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2ServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureStatusCodeP() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureStatusCodePTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS();
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureStatusCodeP(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureIndication2() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureIndication2TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureIndication2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_INDICATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				er.setObservation(ConsolFactory.eINSTANCE.createIndication2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureIndication2(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureIndication2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureMedicationActivity2() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureMedicationActivity2TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureMedicationActivity2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MEDICATION_ACTIVITY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureMedicationActivity2(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMedicationActivity2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureInstruction2() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureInstruction2TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureInstruction2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_INSTRUCTION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setAct(ConsolFactory.eINSTANCE.createInstruction2().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureInstruction2(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureInstruction2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2AuthorParticipation() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2AuthorParticipationTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2AuthorParticipation",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();
				target.getAuthors().add(ConsolFactory.eINSTANCE.createAuthorParticipation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2AuthorParticipation(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2AuthorParticipationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2ReactionObservation2() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2ReactionObservation2TestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2ReactionObservation2",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_REACTION_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation2().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2ReactionObservation2(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2ReactionObservation2TestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddrTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				for (Performer2 p : target.getPerformers()) {
					p.getAssignedEntity().getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddr(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecomTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_PROCEDURE_ACTIVITY_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				for (Performer2 p : target.getPerformers()) {
					p.getAssignedEntity().getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecom(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2ProcedureActivityPerformerProcedureActivityProcedureProcedureActivityPerformerProcedureActivityAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedure2ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedure2ProcedureActivityProcedureProcedureActivityPerformerAssignedEntityTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedure2ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE2_PROCEDURE_ACTIVITY_PROCEDURE_PROCEDURE_ACTIVITY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				for (Performer2 p : target.getPerformers()) {
					p.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2ProcedureActivityProcedureProcedureActivityPerformerAssignedEntity(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedure2ProcedureActivityProcedureProcedureActivityPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolIndication2s() {

		ProcedureActivityProcedure2 target = objectFactory.create();
		target.getConsolIndication2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolMedicationActivity2s() {

		ProcedureActivityProcedure2 target = objectFactory.create();
		target.getConsolMedicationActivity2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolInstruction2() {

		ProcedureActivityProcedure2 target = objectFactory.create();
		target.getConsolInstruction2();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReactionObservation2s() {

		ProcedureActivityProcedure2 target = objectFactory.create();
		target.getReactionObservation2s();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTemplateId(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTargetSiteCodeP() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureTargetSiteCodePTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTargetSiteCodeP(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureTargetSiteCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureTargetSiteCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				for (CD tsc : target.getTargetSiteCodes()) {
					tsc.setCodeSystem(BAD_CODESYSTEM_ID);
				}
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				for (CD tsc : target.getTargetSiteCodes()) {
					tsc.setCodeSystem(SNOMEDCT_ID);
					tsc.setCode("mustExistOnly");
				}
			}

			@Override
			protected void setDependency(ProcedureActivityProcedure2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureTargetSiteCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTargetSiteCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureMoodCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureMoodCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureMoodCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureStatusCode() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureStatusCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
				CS cs = DatatypesFactory.eINSTANCE.createCS();
				target.setStatusCode(cs);
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.getStatusCode().setCode("completed");
			}

			@Override
			protected void setDependency(ProcedureActivityProcedure2 target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedureStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureStatusCode(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedureSpecimen() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedureSpecimenTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedureSpecimen",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_SPECIMEN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.getSpecimens().add(CDAFactory.eINSTANCE.createSpecimen());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureSpecimen(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureSpecimenTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProcedureActivityProcedurePerformer() {
		OperationsTestCase<ProcedureActivityProcedure2> validateProcedureActivityProcedurePerformerTestCase = new OperationsTestCase<ProcedureActivityProcedure2>(
			"validateProcedureActivityProcedurePerformer",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure2 target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure2 target) {
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedurePerformer(
					(ProcedureActivityProcedure2) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedurePerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityProcedure2Operations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityProcedure2> {
		@Override
		public ProcedureActivityProcedure2 create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityProcedure2();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends ProcedureActivityProcedure2Operations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ProcedureActivityProcedure2Operations
