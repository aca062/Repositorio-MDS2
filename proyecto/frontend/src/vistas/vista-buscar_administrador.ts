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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="layoutPrincipal">
 <vaadin-horizontal-layout style="width: 100%;" id="layoutCanciones">
  <vista-canciones_busqueda_admin id="vistaCanciones_busqueda_admin" style="width: 100%;"></vista-canciones_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="layoutAlbumes" style="width: 100%;">
  <vista-albumes_busqueda_admin id="vistaAlbumes_busqueda_admin" style="width: 100%;"></vista-albumes_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%;" id="layoutListas">
  <vista-listas_de_reproduccion_busqueda_admin id="vistaListas_de_reproduccion_busqueda_admin" style="width: 100%;"></vista-listas_de_reproduccion_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="layoutArtistas" style="width: 100%;">
  <vista-artistas_busqueda_admin id="vistaArtistas_busqueda_admin" style="width: 100%;"></vista-artistas_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%;" id="layoutUsuarios">
  <vista-usuarios_busqueda_admin id="vistaUsuarios_busqueda_admin"></vista-usuarios_busqueda_admin>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="layoutEstilos" style="width: 100%;">
  <vista-estilos_busqueda_admin id="vistaEstilos_busqueda_admin" style="width: 100%;"></vista-estilos_busqueda_admin>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
