import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-buscar_administrador';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion_admin';
import './vista-album_admin';
import './vista-lista_de_reproduccion_admin';
import './vista-artista_admin';
import './vista-usuario_admin';
import './vista-estilo_admin';

@customElement('vista-buscar_elemento')
export class VistaBuscar_elemento extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-buscar_administrador style="margin-left: var(--lumo-space-xl);"></vista-buscar_administrador>
 <vaadin-text-field placeholder="Search" style="align-self: center; width: 50%;">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
 <vaadin-vertical-layout theme="spacing-l" style="align-self: center; margin-top: var(--lumo-space-l);">
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;">
   <vista-cancion_admin></vista-cancion_admin>
   <vista-cancion_admin style="margin-left: var(--lumo-space-xl);"></vista-cancion_admin>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;">
   <vista-album_admin></vista-album_admin>
   <vista-album_admin></vista-album_admin>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;">
   <vista-lista_de_reproduccion_admin></vista-lista_de_reproduccion_admin>
   <vista-lista_de_reproduccion_admin style="margin-right: var(--lumo-space-m);"></vista-lista_de_reproduccion_admin>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;">
   <vista-artista_admin></vista-artista_admin>
   <vista-artista_admin></vista-artista_admin>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; align-items: center; justify-content: space-between;">
   <vista-usuario_admin></vista-usuario_admin>
   <vista-usuario_admin></vista-usuario_admin>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;">
   <vista-estilo_admin></vista-estilo_admin>
   <vista-estilo_admin></vista-estilo_admin>
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
