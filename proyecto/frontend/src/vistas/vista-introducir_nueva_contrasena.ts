import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-introducir_nueva_contrasena')
export class VistaIntroducir_nueva_contrasena extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutPrincipal">
 <h2 style="align-self: center; margin-top: var(--lumo-space-xl);" id="h2Titulo">Nueva contraseña</h2>
 <vaadin-text-field error-message="Por favor, introduzca una contraseña" required invalid="" label="Nueva contraseña" style="align-self: center; width: 50%;" id="nuevaContraseña"></vaadin-text-field>
 <vaadin-text-field error-message="Por favor, introduzca la misma contraseña que arriba" required invalid="" label="Vuelva a introducir la contraseña" style="align-self: center; width: 50%;" id="vuelvaAIntroducirLaContraseña"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: center; justify-content: center;" id="layoutBotones">
  <vaadin-button id="cancelar">
    Cancelar 
  </vaadin-button>
  <vaadin-button id="confirmar">
    Confirmar 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
