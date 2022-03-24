import { LitElement, html, css, customElement } from 'lit-element';
import './vista-canciones_busqueda_admin';
import './vista-albumes_busqueda_admin';
import './vista-listas_de_reproduccion_busqueda_admin';
import './vista-artistas_busqueda_admin';
import './vista-usuarios_busqueda_admin';
import './vista-estilos_busqueda_admin';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-buscar_administrador')
export class VistaBuscar_administrador extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;background-color: var(--lumo-contrast-10pct);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout style="width: 100%;">
  <vista-canciones_busqueda_admin></vista-canciones_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vista-albumes_busqueda_admin></vista-albumes_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%;">
  <vista-listas_de_reproduccion_busqueda_admin></vista-listas_de_reproduccion_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout>
  <vista-artistas_busqueda_admin></vista-artistas_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%;">
  <vista-usuarios_busqueda_admin></vista-usuarios_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vista-estilos_busqueda_admin></vista-estilos_busqueda_admin>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
