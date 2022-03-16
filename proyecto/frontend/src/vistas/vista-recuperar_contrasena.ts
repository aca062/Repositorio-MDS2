import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-recuperar_contrasena')
export class VistaRecuperar_contrasena extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 100%; align-items: center; height: 100%;">
  <h3 style="margin: var(--lumo-space-xl);">Recuperación de contraseña</h3>
  <h4 style="width: 50%;">Introduzca su correo electrónico para proceder a la recuperación de su contraseña</h4>
  <vaadin-horizontal-layout theme="spacing" style="align-items: center; width: 60%; justify-content: center;">
   <vaadin-text-field error-message="Por favor, introduzca su correo" required invalid="" style="width: 70%; margin-top: var(--lumo-space-xs);"></vaadin-text-field>
   <vaadin-button style="margin-bottom: var(--lumo-space-l);">
    Confirmar
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
