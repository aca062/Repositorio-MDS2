import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-verificar_e_mail')
export class VistaVerificar_e_mail extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%; align-self: center; align-items: center; padding: var(--lumo-space-xl);">
  <h2>Verificación e-mail</h2>
  <h4 style="width: 42%; align-self: center;">Se ha enviado un mensaje a su correo electrónico con un número de acceso. Escríbalo en el siguiente cuadro y pulse confirmar</h4>
  <vaadin-text-field error-message="Por favor, introduzca su número de acceso" required invalid=""></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-button>
    Cancelar
   </vaadin-button>
   <vaadin-button>
    Confirmar
   </vaadin-button>
   <vaadin-button>
    Enviar otra vez
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
