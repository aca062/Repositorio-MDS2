import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-crear_lista_de_reproduccion')
export class VistaCrear_lista_de_reproduccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="layoutPrincipal">
 <h2 id="h2Titulo" style="align-self: flex-start; padding-left: 50px">Crear lista de reproducción</h2>
 <vaadin-vertical-layout theme="spacing" id="layoutLista" style="width: 90%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);">
  <vaadin-text-field label="Nombre" id="nombre" style="width: 70%;" value="Mi lista nº 3" has-value></vaadin-text-field>
  <h5 id="h5" style="margin-bottom: 0;">Canciones de la lista</h5>
  <vaadin-text-area id="vaadinTextArea" style="width: 100%; height: 100px;"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing-xl" id="layoutBotones" style="width: 100%; justify-content: flex-end;">
   <vaadin-button id="cancelar">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="confirmar">
     Confirmar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
