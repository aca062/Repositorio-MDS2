import { LitElement, html, css, customElement } from 'lit-element';
import './vista-estilo_admin';

@customElement('vista-estilos_busqueda_admin')
export class VistaEstilos_busqueda_admin extends LitElement {
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
 <h1 id="h1">Estilos</h1>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vista-estilo_admin id="vistaEstilo_admin"></vista-estilo_admin>
  <vista-estilo_admin id="vistaEstilo_admin1"></vista-estilo_admin>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
