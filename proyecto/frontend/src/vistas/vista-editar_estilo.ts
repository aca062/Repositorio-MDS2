import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-editar_estilo')
export class VistaEditar_estilo extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: var(--lumo-space-xl);">Editar estilo</h2>
 <vaadin-vertical-layout theme="spacing" style="width: 90%; background-color: var(--lumo-contrast-10pct); height: 160px; align-self: center;" id="layoutEstilo">
  <vaadin-text-field label="Nombre del estilo" placeholder="" id="nombreDelEstilo" style="margin-left: var(--lumo-space-xl); height: 100%; width: 80%;"></vaadin-text-field>
  <vaadin-horizontal-layout id="layoutBotones" style="justify-content: flex-end; flex-wrap: wrap; flex-direction: row; width: 90%; margin-left: var(--lumo-space-xl);">
   <vaadin-button id="cancelar" style="margin-right: 10%;">
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
