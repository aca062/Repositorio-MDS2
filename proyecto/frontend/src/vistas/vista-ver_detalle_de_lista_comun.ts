import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_de_canciones';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_detalle_de_lista_comun')
export class VistaVer_detalle_de_lista_comun extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; margin-left: var(--lumo-space-xl); margin-top: var(--lumo-space-l);" id="layoutPrincipal">
 <vaadin-horizontal-layout theme="spacing" id="layoutTituloOpciones">
  <h2 id="h2Titulo">Lista de reproducción nº 21</h2>
  <vaadin-button id="eliminar" style="align-self: center;">
   Eliminar
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-button id="botonUsuario" style="margin-bottom: var(--lumo-space-xl);">
   Paco12 
 </vaadin-button>
 <vaadin-vertical-layout style="width: 90%; height: 100%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl); margin-bottom: var(--lumo-space-xl);" id="layoutListaCanciones">
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="layoutCanciones">
   <vista-lista_de_canciones style="width: 100%;" id="vistaLista_de_canciones"></vista-lista_de_canciones>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
