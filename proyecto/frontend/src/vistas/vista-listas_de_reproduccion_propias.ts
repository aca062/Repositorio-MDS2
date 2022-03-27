import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_reproduccion_propia';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h1 id="h1">Tus listas de reproducción</h1>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;" id="vaadinHorizontalLayout">
  <vista-lista_de_reproduccion_propia id="vistaLista_de_reproduccion_propia"></vista-lista_de_reproduccion_propia>
  <vista-lista_de_reproduccion_propia id="vistaLista_de_reproduccion_propia1"></vista-lista_de_reproduccion_propia>
  <vista-lista_de_reproduccion_propia id="vistaLista_de_reproduccion_propia2"></vista-lista_de_reproduccion_propia>
  <vista-lista_de_reproduccion_propia id="vistaLista_de_reproduccion_propia3"></vista-lista_de_reproduccion_propia>
  <vista-lista_de_reproduccion_propia id="vistaLista_de_reproduccion_propia4"></vista-lista_de_reproduccion_propia>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end;" id="vaadinHorizontalLayout1">
  <vaadin-button id="vaadinButton">
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
