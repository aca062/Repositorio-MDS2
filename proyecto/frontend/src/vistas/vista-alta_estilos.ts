import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-alta_estilos')
export class VistaAlta_estilos extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: 10%;">Dar de alta estilo</h2>
 <vaadin-horizontal-layout id="layoutEstilo" style="margin-left: 10%; width: 80%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);">
  <vaadin-text-field label="Nombre del estilo" id="nombreDelEstilo" value="Urbano Latino" has-value></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="layoutBotones" style="margin-left: 10%; justify-content: flex-end; width: 80%;">
  <vaadin-button id="cancelar" style="margin: var(--lumo-space-l);">
    Cancelar 
  </vaadin-button>
  <vaadin-button id="confirmar" style="margin: var(--lumo-space-l);">
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
