/**
 */
package org.rm2pt.chatbot.metamodel.chatbot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rm2pt.chatbot.metamodel.chatbot.ChatbotPackage
 * @generated
 */
public interface ChatbotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChatbotFactory eINSTANCE = org.rm2pt.chatbot.metamodel.chatbot.impl.ChatbotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Admin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin</em>'.
	 * @generated
	 */
	Admin createAdmin();

	/**
	 * Returns a new object of class '<em>Chat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chat</em>'.
	 * @generated
	 */
	Chat createChat();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Normal User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal User</em>'.
	 * @generated
	 */
	NormalUser createNormalUser();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ChatbotPackage getChatbotPackage();

} //ChatbotFactory
