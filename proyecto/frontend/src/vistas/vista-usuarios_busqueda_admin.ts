import { LitElement, html, css, customElement } from 'lit-element';
import './vista-usuario_admin';

@customElement('vista-usuarios_busqueda_admin')
export class VistaUsuarios_busqueda_admin extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl); padding-top: 0; padding-bottom: 0;" id="layoutPrincipal">
 <h1 id="h1Usuarios">Usuarios</h1>
 <vaadin-horizontal-layout theme="spacing" id="layoutUsuarios">
  <vista-usuario_admin id="vistaUsuario_admin"></vista-usuario_admin>
  <vista-usuario_admin id="vistaUsuario_admin1"></vista-usuario_admin>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
