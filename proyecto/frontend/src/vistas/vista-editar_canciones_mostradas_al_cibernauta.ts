import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-editar_canciones_mostradas_al_cibernauta')
export class VistaEditar_canciones_mostradas_al_cibernauta extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: var(--lumo-space-xl);">Editar canciones mostradas al cibernauta</h2>
 <vaadin-vertical-layout id="layoutCanciones" style="margin-left: var(--lumo-space-xl); width: 90%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);">
  <h3 id="h3">Lista de canciones</h3>
  <vaadin-text-area id="vaadinTextArea" style="width: 100%; height: 300px;"></vaadin-text-area>
  <vaadin-horizontal-layout theme="spacing-l" id="layoutBotones" style="align-self: flex-end; margin-right: 10%;">
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
