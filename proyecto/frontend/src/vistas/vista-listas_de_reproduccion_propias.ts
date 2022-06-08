import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listas_de_reproduccion_propias')
export class VistaListas_de_reproduccion_propias extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-start; padding-bottom: var(--lumo-space-l); margin-left: var(--lumo-space-xl);" id="layoutPrincipal">
 <h1 id="h1Titulo">Tus listas de reproducción</h1>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; align-items: center; align-self: center;" id="layoutListasPropias"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="layoutBoton">
  <vaadin-button id="verTodas">
    Ver todas 
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
